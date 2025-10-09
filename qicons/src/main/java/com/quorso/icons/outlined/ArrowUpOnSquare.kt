package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowUpOnSquare: ImageVector
    get() {
        if (_ArrowUpOnSquare != null) {
            return _ArrowUpOnSquare!!
        }
        _ArrowUpOnSquare = ImageVector.Builder(
            name = "Outlined.ArrowUpOnSquare",
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
                moveTo(9f, 8.25f)
                horizontalLineTo(7.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, 2.25f)
                verticalLineToRelative(9f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 2.25f)
                horizontalLineToRelative(9f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, -2.25f)
                verticalLineToRelative(-9f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, -2.25f)
                horizontalLineTo(15f)
                moveToRelative(0f, -3f)
                lineToRelative(-3f, -3f)
                moveToRelative(0f, 0f)
                lineToRelative(-3f, 3f)
                moveToRelative(3f, -3f)
                verticalLineTo(15f)
            }
        }.build()

        return _ArrowUpOnSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpOnSquare: ImageVector? = null
