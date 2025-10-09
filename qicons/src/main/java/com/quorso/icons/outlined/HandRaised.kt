package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.HandRaised: ImageVector
    get() {
        if (_HandRaised != null) {
            return _HandRaised!!
        }
        _HandRaised = ImageVector.Builder(
            name = "Outlined.HandRaised",
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
                moveTo(10.05f, 4.575f)
                arcToRelative(1.575f, 1.575f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.15f, 0f)
                verticalLineToRelative(3f)
                moveToRelative(3.15f, -3f)
                verticalLineToRelative(-1.5f)
                arcToRelative(1.575f, 1.575f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.15f, 0f)
                verticalLineToRelative(1.5f)
                moveToRelative(-3.15f, 0f)
                lineToRelative(0.075f, 5.925f)
                moveToRelative(3.075f, 0.75f)
                verticalLineTo(4.575f)
                moveToRelative(0f, 0f)
                arcToRelative(1.575f, 1.575f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.15f, 0f)
                verticalLineTo(15f)
                moveTo(6.9f, 7.575f)
                arcToRelative(1.575f, 1.575f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.15f, 0f)
                verticalLineToRelative(8.175f)
                arcToRelative(6.75f, 6.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.75f, 6.75f)
                horizontalLineToRelative(2.018f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.712f, -1.538f)
                lineToRelative(1.732f, -1.732f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.538f, -3.712f)
                lineToRelative(0.003f, -2.024f)
                arcToRelative(0.668f, 0.668f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.198f, -0.471f)
                arcToRelative(1.575f, 1.575f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.228f, -2.228f)
                arcToRelative(3.818f, 3.818f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.12f, 2.687f)
                moveTo(6.9f, 7.575f)
                verticalLineTo(12f)
                moveToRelative(6.27f, 4.318f)
                arcTo(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.35f, 15f)
                moveToRelative(0.002f, 0f)
                horizontalLineToRelative(-0.002f)
            }
        }.build()

        return _HandRaised!!
    }

@Suppress("ObjectPropertyName")
private var _HandRaised: ImageVector? = null
