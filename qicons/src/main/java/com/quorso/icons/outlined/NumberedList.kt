package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.NumberedList: ImageVector
    get() {
        if (_NumberedList != null) {
            return _NumberedList!!
        }
        _NumberedList = ImageVector.Builder(
            name = "Outlined.NumberedList",
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
                moveTo(8.242f, 5.992f)
                horizontalLineToRelative(12f)
                moveToRelative(-12f, 6.003f)
                horizontalLineTo(20.24f)
                moveToRelative(-12f, 5.999f)
                horizontalLineToRelative(12f)
                moveTo(4.117f, 7.495f)
                verticalLineToRelative(-3.75f)
                horizontalLineTo(2.99f)
                moveToRelative(1.125f, 3.75f)
                horizontalLineTo(2.99f)
                moveToRelative(1.125f, 0f)
                horizontalLineTo(5.24f)
                moveToRelative(-1.92f, 2.577f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.591f, 1.59f)
                lineToRelative(-1.83f, 1.83f)
                horizontalLineToRelative(2.16f)
                moveTo(2.99f, 15.745f)
                horizontalLineToRelative(1.125f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.25f)
                horizontalLineTo(3.74f)
                moveToRelative(0f, -0.002f)
                horizontalLineToRelative(0.375f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.25f)
                horizontalLineTo(2.99f)
            }
        }.build()

        return _NumberedList!!
    }

@Suppress("ObjectPropertyName")
private var _NumberedList: ImageVector? = null
