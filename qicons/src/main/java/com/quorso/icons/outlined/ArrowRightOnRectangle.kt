package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowRightOnRectangle: ImageVector
    get() {
        if (_ArrowRightOnRectangle != null) {
            return _ArrowRightOnRectangle!!
        }
        _ArrowRightOnRectangle = ImageVector.Builder(
            name = "Outlined.ArrowRightOnRectangle",
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
                moveTo(15.75f, 9f)
                verticalLineTo(5.25f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 3f)
                horizontalLineToRelative(-6f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, 2.25f)
                verticalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 21f)
                horizontalLineToRelative(6f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, -2.25f)
                verticalLineTo(15f)
                moveToRelative(3f, 0f)
                lineToRelative(3f, -3f)
                moveToRelative(0f, 0f)
                lineToRelative(-3f, -3f)
                moveToRelative(3f, 3f)
                horizontalLineTo(9f)
            }
        }.build()

        return _ArrowRightOnRectangle!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightOnRectangle: ImageVector? = null
