package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Ticket: ImageVector
    get() {
        if (_Ticket != null) {
            return _Ticket!!
        }
        _Ticket = ImageVector.Builder(
            name = "Outlined.Ticket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 6f)
                verticalLineToRelative(0.75f)
                moveToRelative(0f, 3f)
                verticalLineToRelative(0.75f)
                moveToRelative(0f, 3f)
                verticalLineToRelative(0.75f)
                moveToRelative(0f, 3f)
                verticalLineTo(18f)
                moveToRelative(-9f, -5.25f)
                horizontalLineToRelative(5.25f)
                moveTo(7.5f, 15f)
                horizontalLineToRelative(3f)
                moveTo(3.375f, 5.25f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(3.026f)
                arcToRelative(2.999f, 2.999f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 5.198f)
                verticalLineToRelative(3.026f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                horizontalLineToRelative(17.25f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                verticalLineToRelative(-3.026f)
                arcToRelative(2.999f, 2.999f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -5.198f)
                verticalLineTo(6.375f)
                curveToRelative(0f, -0.621f, -0.504f, -1.125f, -1.125f, -1.125f)
                horizontalLineTo(3.375f)
                close()
            }
        }.build()

        return _Ticket!!
    }

@Suppress("ObjectPropertyName")
private var _Ticket: ImageVector? = null
