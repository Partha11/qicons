package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Truck: ImageVector
    get() {
        if (_Truck != null) {
            return _Truck!!
        }
        _Truck = ImageVector.Builder(
            name = "Outlined.Truck",
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
                moveTo(8.25f, 18.75f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                moveToRelative(3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
                moveToRelative(3f, 0f)
                horizontalLineToRelative(6f)
                moveToRelative(-9f, 0f)
                horizontalLineTo(3.375f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.125f, -1.125f)
                verticalLineTo(14.25f)
                moveToRelative(17.25f, 4.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                moveToRelative(3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
                moveToRelative(3f, 0f)
                horizontalLineToRelative(1.125f)
                curveToRelative(0.621f, 0f, 1.129f, -0.504f, 1.09f, -1.124f)
                arcToRelative(17.902f, 17.902f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.213f, -9.193f)
                arcToRelative(2.056f, 2.056f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.58f, -0.86f)
                horizontalLineTo(14.25f)
                moveTo(16.5f, 18.75f)
                horizontalLineToRelative(-2.25f)
                moveToRelative(0f, -11.177f)
                verticalLineToRelative(-0.958f)
                curveToRelative(0f, -0.568f, -0.422f, -1.048f, -0.987f, -1.106f)
                arcToRelative(48.554f, 48.554f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.026f, 0f)
                arcToRelative(1.106f, 1.106f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.987f, 1.106f)
                verticalLineToRelative(7.635f)
                moveToRelative(12f, -6.677f)
                verticalLineToRelative(6.677f)
                moveToRelative(0f, 4.5f)
                verticalLineToRelative(-4.5f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-12f)
            }
        }.build()

        return _Truck!!
    }

@Suppress("ObjectPropertyName")
private var _Truck: ImageVector? = null
